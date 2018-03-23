package dao;

import dao.rows.AttributesRow;
import dao.rows.ObjectsRow;
import dao.rows.ParametersRow;
import dao.rows.TypesRow;
import dao.rows.rowMappers.AttributesRowMapper;
import dao.rows.rowMappers.ObjectsRowMapper;
import dao.rows.rowMappers.ParametersRowMapper;
import dao.rows.rowMappers.TypesRowMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Random;

@Slf4j
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class AbstractDAO<T> implements DAO<T> {

    JdbcTemplate jdbcTemplate;

    public AbstractDAO(JdbcTemplate jdbcTemplate) {

    }

    @Override
    @Transactional
    public void create(@NotNull T entity) {
        createObjects(entity);
        createParameters(entity);
        createAttributes(entity);
        createTypes(entity);
    }

    @Override
    @Transactional
    public T read(@NotNull Long id) {
        T entity = readObjects(id);
        readParameters(id, entity);
        readAttributes(id, entity);
        readTypes(id, entity);
        return entity;
    }

    @Override
    @Transactional
    public void update(@NotNull T entity) {
        updateObjects(entity);
        updateParameters(entity);
        updateAttributes(entity);
        updateTypes(entity);

    }

    @Override
    @Transactional
    public void delete(@NotNull Long id) {
        deleteParameters(id);
        deleteAttributes(id);
        deleteObjects(id);
        deleteTypes(id);
    }

    protected abstract void createObjects(T entity);

    protected abstract void createParameters(T entity);

    protected abstract void createAttributes(T entity);

    protected abstract void createTypes(T entity);

    protected abstract void updateObjects(T entity);

    protected abstract void updateParameters(T entity);

    protected abstract void updateAttributes(T entity);

    protected abstract void updateTypes(T entity);

    private T readObjects(Long id) {
        String sqlObjectsRead = loadSqlStatement("src/main/resources/db/objects/read.sql");
        T entity = mapObjects(findObject(sqlObjectsRead, new ObjectsRowMapper(), id));
        return entity;
    }

    protected abstract ObjectsRow findObject(String sqlObjectsRead, ObjectsRowMapper objectsRowMapper, Long id);

    public void readParameters(Long id, T entity) {
        String sqlParametersRead = loadSqlStatement("src/main/resources/db/parameters/read.sql");
        mapParameters(findParameters(sqlParametersRead, new ParametersRowMapper(), id), entity);

    }

    public void readAttributes(Long id, T entity) {
        String sqlAttributesRead = loadSqlStatement("src/main/resources/db/attributes/read.sql");
        mapAttributes(findAttributes(sqlAttributesRead, new AttributesRowMapper(), id), entity);
    }

    public void readTypes(Long id, T entity) {
        String sqlTypesRead = loadSqlStatement("src/main/resources/db/types/read.sql");
        mapTypes(findTypes(sqlTypesRead, new TypesRowMapper(), id), entity);
    }

    public abstract List<ParametersRow> findParameters(String sqlTypesRead, ParametersRowMapper typesRowMapper, Long id);

    public abstract List<AttributesRow> findAttributes(String sqlTypesRead, AttributesRowMapper typesRowMapper, Long id);

    public abstract List<TypesRow> findTypes(String sqlTypesRead, TypesRowMapper typesRowMapper, Long id);

    public void deleteObjects(Long id) {
        String sqlObjectsDelete = loadSqlStatement("src/main/resources/db/objects/delete.sql");
        executeUpdate(sqlObjectsDelete, id);
    }

    public void deleteParameters(Long id) {
        String sqlParametersDelete = loadSqlStatement("src/main/resources/db/parameters/delete.sql");
        executeUpdate(sqlParametersDelete, id);
    }

    public void deleteAttributes(Long id) {
        String sqlAttributesDelete = loadSqlStatement("src/main/resources/db/attributes/delete.sql");
        executeUpdate(sqlAttributesDelete, id);
    }

    public void deleteTypes(Long id) {
        String sqlTypesDelete = loadSqlStatement("src/main/resources/db/types/delete.sql");
        executeUpdate(sqlTypesDelete, id);
    }

    public abstract T mapObjects(@Nullable ObjectsRow objectsRow);

    public abstract void mapParameters(@Nullable List<ParametersRow> parametersRowList, T entity);

    public abstract void mapAttributes(@Nullable List<AttributesRow> attributesRowList, T entity);

    public abstract void mapTypes(@Nullable List<TypesRow> typesRowList, T entity);

    protected Long generateId(Integer typeId) {
        Random random = new Random(System.currentTimeMillis());
        String id = typeId.toString().concat(
                LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES).toString()
                        .replaceAll("-", "")
                        .replaceAll("T", "")
                        .replaceAll(":", "")
        ).concat(String.valueOf(random.nextInt(1000)));
        return Long.valueOf(id);
    }

    private String loadSqlStatement(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Files.lines(Paths.get(path), StandardCharsets.UTF_8).forEach(stringBuilder::append);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    private void executeUpdate(String sql, Object... parameters) {
        jdbcTemplate.update(sql, parameters);
    }

}