package dao.impl;

import dao.AbstractDAO;
import dao.ParametersDAO;
import dao.rows.AttributesRow;
import dao.rows.ObjectsRow;
import dao.rows.ParametersRow;
import dao.rows.TypesRow;
import dao.rows.rowMappers.AttributesRowMapper;
import dao.rows.rowMappers.ObjectsRowMapper;
import dao.rows.rowMappers.ParametersRowMapper;
import dao.rows.rowMappers.TypesRowMapper;
import entity.Parameters;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ParametersDAOImpl extends AbstractDAO<Parameters> implements ParametersDAO {

    public ParametersDAOImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    public void create(@NotNull Parameters entity) {

    }

    @Override
    public Parameters read(@NotNull Long id) {
        return null;
    }

    @Override
    public void update(@NotNull Parameters entity) {

    }

    @Override
    public void delete(@NotNull Long id) {

    }

    @Override
    protected void createObjects(Parameters entity) {

    }

    @Override
    protected void createParameters(Parameters entity) {

    }

    @Override
    protected void createAttributes(Parameters entity) {

    }

    @Override
    protected void createTypes(Parameters entity) {

    }

    @Override
    protected void updateObjects(Parameters entity) {

    }

    @Override
    protected void updateParameters(Parameters entity) {

    }

    @Override
    protected void updateAttributes(Parameters entity) {

    }

    @Override
    protected void updateTypes(Parameters entity) {

    }

    @Override
    protected ObjectsRow findObject(String sqlObjectsRead, ObjectsRowMapper objectsRowMapper, Long id) {
        return null;
    }

    @Override
    public List<ParametersRow> findParameters(String sqlTypesRead, ParametersRowMapper typesRowMapper, Long id) {
        return null;
    }

    @Override
    public List<AttributesRow> findAttributes(String sqlTypesRead, AttributesRowMapper typesRowMapper, Long id) {
        return null;
    }

    @Override
    public List<TypesRow> findTypes(String sqlTypesRead, TypesRowMapper typesRowMapper, Long id) {
        return null;
    }

    @Override
    public Parameters mapObjects(@Nullable ObjectsRow objectsRow) {
        return null;
    }

    @Override
    public void mapParameters(@Nullable List<ParametersRow> parametersRowList, Parameters entity) {

    }

    @Override
    public void mapAttributes(@Nullable List<AttributesRow> attributesRowList, Parameters entity) {

    }

    @Override
    public void mapTypes(@Nullable List<TypesRow> typesRowList, Parameters entity) {

    }
}
