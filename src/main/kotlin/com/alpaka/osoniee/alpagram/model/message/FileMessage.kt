package com.alpaka.osoniee.alpagram.model.message

class FileMessage: BaseMessage {
    private var fileId: String
    private var text: String? = null

    constructor(senderId: String, groupId: String, fileId: String): super(senderId, groupId) {
        this.fileId = fileId
    }

    constructor(senderId: String, groupId: String, fileId: String, text: String) : super(senderId, groupId) {
        this.fileId = fileId
        this.text = text
    }
}
