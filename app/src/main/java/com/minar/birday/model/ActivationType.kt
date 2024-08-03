package com.minar.birday.model

enum class ActivationCode {
    ACTIVATE,
    DEACTIVATE
}

data class ActivationType(val codeName: ActivationCode, val value: String) {
    override fun toString(): String = value // The value shown in the spinner
}