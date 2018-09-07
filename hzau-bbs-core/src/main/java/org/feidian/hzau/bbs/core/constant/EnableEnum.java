package org.feidian.hzau.bbs.core.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author stormphoenix
 * @date 2018-09-07
 * @time 下午10:45
 */
@Getter
@AllArgsConstructor
public enum EnableEnum {
    ENABLE(1, "ENABLE"),
    DISABLE(0, "DISABLE");

    private final Integer id;
    private final String code;

    private static final Map<Integer, String> idCodeMap = new HashMap();

    static {
        idCodeMap.put(ENABLE.getId(), ENABLE.getCode());
        idCodeMap.put(DISABLE.getId(), DISABLE.getCode());
    }

    public static String getCodeById(Integer id) {
        if (id == null) {
            return null;
        }
        return idCodeMap.get(id);
    }
}
