package org.feidian.hzau.bbs.data.typehandler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.feidian.hzau.bbs.core.Describable;
import org.feidian.hzau.bbs.core.constant.EnableEnum;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhaomingqiang
 * @Description
 * @Date Created in 2018/3/10 20:17
 */
@MappedJdbcTypes({JdbcType.TINYINT, JdbcType.SMALLINT, JdbcType.INTEGER, JdbcType.BIGINT})
@MappedTypes({EnableEnum.class})
public class EnumToIdTypeHandler<T extends Enum & Describable> extends BaseTypeHandler<T> {

    private final Map<Integer, T> idMap = new HashMap();

    public EnumToIdTypeHandler(Class<T> type) {
        if (type == null || !type.isEnum()) {
            throw new IllegalArgumentException("Type argument error");
        }
        Arrays.stream(type.getEnumConstants()).forEach(e -> {
            idMap.put(e.getId(), e);
        });
    }

    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, T describable
            , JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i, describable.getId());
    }

    @Override
    public T getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return idMap.get(resultSet.getInt(s));
    }

    @Override
    public T getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return idMap.get(resultSet.getInt(i));
    }

    @Override
    public T getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return idMap.get(callableStatement.getInt(i));
    }
}
