package dao.impl;

import dao.AbstractDAO;
import dao.AttributesDAO;
import dao.rows.AttributesRow;
import dao.rows.ObjectsRow;
import dao.rows.ParametersRow;
import dao.rows.TypesRow;
import dao.rows.rowMappers.AttributesRowMapper;
import dao.rows.rowMappers.ObjectsRowMapper;
import dao.rows.rowMappers.ParametersRowMapper;
import dao.rows.rowMappers.TypesRowMapper;
import entity.Attributes;
import org.jetbrains.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttributesDAOImpl extends AbstractDAO<Attributes> implements AttributesDAO {

    @Autowired
    public AttributesDAOImpl(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    @Override
    protected void createObjects(Attributes entity) {

    }

    @Override
    protected void createParameters(Attributes entity) {

    }

    @Override
    protected void createAttributes(Attributes entity) {

    }

    @Override
    protected void createTypes(Attributes entity) {

    }

    @Override
    protected void updateObjects(Attributes entity) {

    }

    @Override
    protected void updateParameters(Attributes entity) {

    }

    @Override
    protected void updateAttributes(Attributes entity) {

    }

    @Override
    protected void updateTypes(Attributes entity) {

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
    public Attributes mapObjects(@Nullable ObjectsRow objectsRow) {
        return null;
    }

    @Override
    public void mapParameters(@Nullable List<ParametersRow> parametersRowList, Attributes entity) {

    }

    @Override
    public void mapAttributes(@Nullable List<AttributesRow> attributesRowList, Attributes entity) {

    }

    @Override
    public void mapTypes(@Nullable List<TypesRow> typesRowList, Attributes entity) {

    }
}