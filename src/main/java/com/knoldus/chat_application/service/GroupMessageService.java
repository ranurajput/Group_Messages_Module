package com.knoldus.chat_application.service;
import com.knoldus.chat_application.model.GroupMessage;
import com.knoldus.chat_application.model.GroupMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
@Service
public class GroupMessageService {
    @Autowired
    GroupMessageRepository groupMessageRepository;
    public String sendData(GroupMessage receivedGroupMessage)
    {
        GroupMessage groupMessage = new GroupMessage();
        groupMessage.setSenderID(receivedGroupMessage.getSenderID());
        groupMessage.setGroupID(receivedGroupMessage.getGroupID());
        groupMessage.setMessage(receivedGroupMessage.getMessage());

        Date currentDate = new Date();
        groupMessage.setCreatedDate(currentDate);
        groupMessage.setUpdatedDate(currentDate);
        groupMessageRepository.save(groupMessage);
        return "message send successfully";
    }
    public Iterable<GroupMessage> fetchGroupMessages(GroupMessage fetchGroupMessage)
    {
     return groupMessageRepository.fetchGroupMessages(fetchGroupMessage.getGroupID());
    }
}
