package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>{
	//custom finder methods:
	List<Tutorial> findByPublished(boolean Published);
	List<Tutorial> findByTitleContaining(String title);
	
}
//Now we can use JpaRepository’s methods: save(), findOne(), findById(), findAll(), count(), delete(), deleteById()…
//without implementing these methods.