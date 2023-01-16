package com.alpaka.osoniee.alpagram.model.message

class TextMessage: BaseMessage {
    private var text: String

    constructor(senderId: String, groupId: String, text: String): super(senderId, groupId) {
        this.text = text
    }
}
