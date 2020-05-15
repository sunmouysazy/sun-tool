package com.example.suntools.entity;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * ChinaDateEntity
 * ---------------------------------------------------------------------------------------------------------------------
 * 阴历实体
 *
 * @author Ike
 * @date 2020年5月13日18:20:29
 */
@Data
public class ChinaDateEntity {
    // 数据库弄好前暂时使用Map
    private Map<String, String> birthDays;
    // 农历日
    private String              chinaDay;
    // 农历年
    private String              chinaYear;
    // 星期几
    private String              weekDay;
    // 生日名单
    private String              birthdayPersons;
    // 公历
    private String              publicDay;

    public ChinaDateEntity() {
        birthDays = new HashMap<>();
        birthDays.put("父亲", "四月廿二");
        birthDays.put("母亲", "七月十八");
        birthDays.put("爱人", "腊月初三");
        birthDays.put("自己", "六月初十");
    }
}
