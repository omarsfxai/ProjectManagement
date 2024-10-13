package com.Gestion_projets.infrastructure.presistence.repo;

import com.Gestion_projets.domain.model.Notification;
import com.Gestion_projets.infrastructure.presistence.mapper.NotificationMapper;
import com.Gestion_projets.infrastructure.presistence.repo.jpa.NotificationRepo;
import org.springframework.context.annotation.Lazy;
import com.Gestion_projets.domain.repository.NotificationRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public class NotificationRepoImpl implements NotificationRepository {
    private final NotificationRepo notificationRepo;

    public NotificationRepoImpl(@Lazy NotificationRepo notificationRepo) {
        this.notificationRepo = notificationRepo;
    }

    @Override
    public Notification save(Notification notification) {
        return NotificationMapper.toDomain(notificationRepo.save(NotificationMapper.toEntity(notification)));
    }

    @Override
    public List<Notification> findAllNotifications() {
        return notificationRepo.findAll()
                .stream()
                .map(NotificationMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Notification> findNotificationById(Long id) {
        return notificationRepo.findById(id)
                .map(NotificationMapper::toDomain);
    }

    @Override
    public void deleteNotificationById(Long id) {
        notificationRepo.deleteById(id);
    }


}
