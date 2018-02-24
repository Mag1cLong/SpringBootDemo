package indi.jcl.dao;

import indi.jcl.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by jcl on 2018/2/22
 */
@Repository
public interface UserDAO extends JpaRepository<User, Long> {
    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}
