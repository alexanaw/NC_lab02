package dao.impl;

import dao.AbstractDAO;
import dao.ObjectsDAO;
import dao.rows.AttributesRow;
import dao.rows.ObjectsRow;
import dao.rows.ParametersRow;
import dao.rows.TypesRow;
import dao.rows.rowMappers.AttributesRowMapper;
import dao.rows.rowMappers.ObjectsRowMapper;
import dao.rows.rowMappers.ParametersRowMapper;
import dao.rows.rowMappers.TypesRowMapper;
import entity.Objects;
import org.jetbrains.annotations.Nullable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ObjectsDAOImpl extends AbstractDAO<Objects> implements ObjectsDAO {


    public ObjectsDAOImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    protected void createObjects(Objects entity) {

    }

    @Override
    protected void createParameters(Objects entity) {

    }

    @Override
    protected void createAttributes(Objects entity) {

    }

    @Override
    protected void createTypes(Objects entity) {

    }

    @Override
    protected void updateObjects(Objects entity) {

    }

    @Override
    protected void updateParameters(Objects entity) {

    }

    @Override
    protected void updateAttributes(Objects entity) {

    }

    @Override
    protected void updateTypes(Objects entity) {

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
    public Objects mapObjects(@Nullable ObjectsRow objectsRow) {
        return null;
    }

    @Override
    public void mapParameters(@Nullable List<ParametersRow> parametersRowList, Objects entity) {

    }

    @Override
    public void mapAttributes(@Nullable List<AttributesRow> attributesRowList, Objects entity) {

    }

    @Override
    public void mapTypes(@Nullable List<TypesRow> typesRowList, Objects entity) {

    }


}
