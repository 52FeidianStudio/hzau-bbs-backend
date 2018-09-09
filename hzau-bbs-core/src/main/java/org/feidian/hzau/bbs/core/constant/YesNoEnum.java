package org.feidian.hzau.bbs.core.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author stormphoenix
 * @date 2018-09-09
 * @time 下午1:49
 */
@Getter
@AllArgsConstructor
public enum YesNoEnum {
    YES(1, "YES"),
    NO(0, "NO");

    private final int id;
    private final String code;

    private static final Map<Integer, String> idCodeMap = new HashMap();

    static {
        idCodeMap.put(YES.getId(), YES.getCode());
        idCodeMap.put(NO.getId(), NO.getCode());
    }

    public static String getCodeById(Integer id) {
        if (id == null) {
            return null;
        }
        return idCodeMap.get(id);
    }
}
