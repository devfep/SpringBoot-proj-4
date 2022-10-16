package com.devfep.proj4noteApp.services;

import com.devfep.proj4noteApp.dtos.NoteDto;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface NoteService {
    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    @Transactional
    void deleteNoteById(Long noteId);

    @Transactional
    void updateNoteById(NoteDto noteDto);

    @Transactional
    List<NoteDto> getAllNotesByUserId(Long userId);

    @Transactional
    Optional<NoteDto> getNoteById(Long noteId);
}
