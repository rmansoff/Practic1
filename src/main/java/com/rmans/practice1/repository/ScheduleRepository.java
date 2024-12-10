package com.rmans.practice1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rmans.model.Schedule;
package com.rmans.practice1.repository;


@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    // Можна додавати кастомні методи для пошуку
}
