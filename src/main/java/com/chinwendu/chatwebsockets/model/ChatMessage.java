package com.chinwendu.chatwebsockets.model;

import com.chinwendu.chatwebsockets.enums.MessageType;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class ChatMessage {
    private String message;
    private String sender;
    private MessageType messageType;
}
