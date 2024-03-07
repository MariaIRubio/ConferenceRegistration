package com.exercise.conferenceregistration.repo;

import com.exercise.conferenceregistration.entity.Attendee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendeeRepo extends JpaRepository <Attendee, Long> {
}
