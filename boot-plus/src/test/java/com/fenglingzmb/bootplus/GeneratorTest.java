package com.fenglingzmb.bootplus;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @Author: fenglingzmb
 * @Date: 2022/3/4
 */
public class GeneratorTest {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://fenglingzmb.com:3306/MyBatis", "root", "ws")
                .globalConfig(builder -> {
                    builder.author("fenglingzmb")
                            //.enableSwagger()
                            .fileOverride()
                            .outputDir("D://mybatis_plus");
                })
                .packageConfig(builder -> {
                    builder.parent("com.fenglingzmb") // 设置父包名
                            .moduleName("bootplus") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "D://mybatis_plus"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
