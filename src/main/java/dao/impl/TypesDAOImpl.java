package dao.impl;

import dao.AbstractDAO;
import dao.TypesDAO;
import dao.rows.AttributesRow;
import dao.rows.ObjectsRow;
import dao.rows.ParametersRow;
import dao.rows.TypesRow;
import dao.rows.rowMappers.AttributesRowMapper;
import dao.rows.rowMappers.ObjectsRowMapper;
import dao.rows.rowMappers.ParametersRowMapper;
import dao.rows.rowMappers.TypesRowMapper;
import entity.Types;
import org.jetbrains.annotations.Nullable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TypesDAOImpl extends AbstractDAO<Types> implements TypesDAO {


    public TypesDAOImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    protected void createObjects(Types entity) {

    }

    @Override
    protected void createParameters(Types entity) {

    }

    @Override
    protected void createAttributes(Types entity) {

    }

    @Override
    protected void createTypes(Types entity) {

    }

    @Override
    protected void updateObjects(Types entity) {

    }

    @Override
    protected void updateParameters(Types entity) {

    }

    @Override
    protected void updateAttributes(Types entity) {

    }

    @Override
    protected void updateTypes(Types entity) {

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
    public Types mapObjects(@Nullable ObjectsRow objectsRow) {
        return null;
    }

    @Override
    public void mapParameters(@Nullable List<ParametersRow> parametersRowList, Types entity) {

    }

    @Override
    public void mapAttributes(@Nullable List<AttributesRow> attributesRowList, Types entity) {

    }

    @Override
    public void mapTypes(@Nullable List<TypesRow> typesRowList, Types entity) {

    }
}
