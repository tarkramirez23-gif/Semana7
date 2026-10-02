package com.theylor.actividad_moviles

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class CounterViewModel : ViewModel() {
    // Estado privado mutable iniciado en 0
    private val _count = MutableStateFlow(0)
    // Estado público de solo lectura para la UI
    val count: StateFlow<Int> = _count.asStateFlow()

    // Función para incrementar el contador en 1
    fun increment() {
        _count.value += 1
    }
}
