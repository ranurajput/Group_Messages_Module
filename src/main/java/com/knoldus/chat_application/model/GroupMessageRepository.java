package com.knoldus.chat_application.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GroupMessageRepository extends JpaRepository<GroupMessage, Integer> {
    @Query(value = "SELECT * FROM group_message WHERE groupID = ?1  ", nativeQuery = true)
    Iterable<GroupMessage> fetchGroupMessages(int groupID);
}
