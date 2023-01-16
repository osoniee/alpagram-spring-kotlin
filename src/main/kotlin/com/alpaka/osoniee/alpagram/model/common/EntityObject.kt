package com.alpaka.osoniee.alpagram.model.common
import java.util.UUID

open class EntityObject {

    val id: String
    val registrationTime: Long
    val modificationTime: Long
    val entityVersion: Long

    constructor() {
        id = UUID.randomUUID().toString()
        registrationTime = System.currentTimeMillis()
        modificationTime = 0L
        entityVersion = 1
    }

    constructor(ancestor: EntityObject) {
        id = ancestor.id
        registrationTime = ancestor.registrationTime
        modificationTime = System.currentTimeMillis()
        entityVersion = ancestor.entityVersion + 1
    }

    override fun equals(other: Any?): Boolean =
            (other is EntityObject) &&
                    this.id == other.id &&
                    this.entityVersion == other.entityVersion

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + registrationTime.hashCode()
        result = 31 * result + modificationTime.hashCode()
        result = 31 * result + entityVersion.hashCode()
        return result
    }
}
