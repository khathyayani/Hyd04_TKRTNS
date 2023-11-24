/*Created by-vallapu khathyayani
 * Date Created-24/11/2023
 */
package com.tns.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tns.entity.College;

public interface ICollegeRepository extends JpaRepository<College,Long> {
	College addCollege(College College);
	College updateCollege(College college);
	College searchCollege(long id);
	College deleteCollege(long id);
	

}