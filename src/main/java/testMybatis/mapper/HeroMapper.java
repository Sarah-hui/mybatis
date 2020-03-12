package testMybatis.mapper;

import testMybatis.model.Hero;

import java.util.List;

public interface HeroMapper {
    /**
     * 查询所有内容
     */
    List<Hero> selectHeroList();
}
