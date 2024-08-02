package com.akshayashokcode.notepad.feature_note.domain.use_case

import com.akshayashokcode.notepad.feature_note.domain.model.Note
import com.akshayashokcode.notepad.feature_note.domain.repository.NoteRepository
import kotlin.jvm.Throws

class AddNote(
    private val repository:NoteRepository
) {

    @Throws(Note.InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw Note.InvalidNoteException("El titulo no puede estar vacio.")
        }
        if(note.content.isBlank()){
            throw Note.InvalidNoteException("El contenido no puede estar vacio.")
        }
        repository.insertNote(note)
    }
}