package jpaDemo.com.repository;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

@NoRepositoryBean
public interface GenericDao<T> extends JpaRepository<T,ID> {
    @Query("select t from #{#entityName} t where t.id=?1")
    public T findById(int id);

    @Query(value = "select * from #{#entityName} order by convert(name using gbk) asc",nativeQuery = true)
    public List<T> find();
}
