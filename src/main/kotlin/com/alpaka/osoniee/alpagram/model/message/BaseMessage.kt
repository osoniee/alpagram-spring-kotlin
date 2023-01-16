package com.alpaka.osoniee.alpagram.model.message

import com.alpaka.osoniee.alpagram.model.common.Porter

open class BaseMessage(senderId: String, groupId: String, private var read: Boolean = true) : Porter(senderId, groupId) {

    fun read(): BaseMessage {
        this.read = true
        return this
    }

    fun unread(): BaseMessage {
        this.read = false
        return this
    }
}
