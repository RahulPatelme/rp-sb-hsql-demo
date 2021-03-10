package nz.ac.op.cs.SB_HSQL_Prj.db;


import nz.ac.op.cs.SB_HSQL_Prj.models.QuizUser;
import org.springframework.data.repository.CrudRepository;

public interface QuizUserRepository  extends CrudRepository<QuizUser, String>{
}
