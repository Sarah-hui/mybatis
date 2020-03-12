package testMybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import testMybatis.mapper.HeroMapper;
import testMybatis.model.Hero;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class HeroApplication{
    public static void main(String[] args) throws IOException{
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            HeroMapper heroMapper = sqlSession.getMapper(HeroMapper.class);
            List<Hero> heroList = heroMapper.selectHeroList();
            for (Hero hero : heroList) {
                System.out.println("packageId:"+hero.getId());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }
}