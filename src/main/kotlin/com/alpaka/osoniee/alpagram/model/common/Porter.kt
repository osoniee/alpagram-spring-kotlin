package com.alpaka.osoniee.alpagram.model.common

open class Porter: EntityObject {
     private val senderId: String
     private val groupId: String

     protected constructor(obj: Porter): super(obj) {
          senderId = obj.senderId
          groupId = obj.groupId
     }

     protected constructor(senderId: String, groupId: String) : super() {
          this.senderId = senderId
          this.groupId = groupId
     }
}
