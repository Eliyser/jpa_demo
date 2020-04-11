package jpaDemo.com.repository;

import jpaDemo.com.entity.Project;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectRepositoryTest {

    @Resource
    private ProjectRepository projectRepository;

    @Test
    public void findByIdTest(){
        Project project=new Project();
        project.setId(5);
        projectRepository.save(project);
        project=projectRepository.findById(5);
        Assert.assertThat(project.getId(),is(5));
    }

    @Test
    public void findAllTest(){
        List<Project> projects=projectRepository.find();
        for(Project project:projects){
            System.out.println(project.getName());
        }
    }

}