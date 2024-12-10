package com.rmans.practice1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmans.model.Schedule;
import com.rmans.repository.ScheduleRepository;
import com.rmans.practice1.service.ScheduleService;
import com.rmans.practice1.repository.ScheduleRepository;
import com.rmans.practice1.service.ScheduleService;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Schedule> getAllSchedules() {
        return scheduleRepository.findAll();
    }

    public Schedule getScheduleById(Long id) {
        Optional<Schedule> schedule = scheduleRepository.findById(id);
        return schedule.orElse(null);  // Повертає null, якщо не знайдено
    }

    public Schedule createSchedule(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public Schedule updateSchedule(Long id, Schedule schedule) {
        if (scheduleRepository.existsById(id)) {
            schedule.setId(id);
            return scheduleRepository.save(schedule);
        }
        return null;  // Повертає null, якщо запис з таким id не знайдено
    }

    public void deleteSchedule(Long id) {
        if (scheduleRepository.existsById(id)) {
            scheduleRepository.deleteById(id);
        }
    }
}
