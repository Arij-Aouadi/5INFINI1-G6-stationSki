package com.example.stationski;

import com.example.stationski.entities.*;
import com.example.stationski.repositories.CoursRepository;
import com.example.stationski.repositories.PisteRepository;
import com.example.stationski.repositories.SkieurRepository;
import com.example.stationski.services.SkieurService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

import java.util.HashSet;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SkieurServiceTest {

    @Mock
    private SkieurRepository skieurRepository;

    @Mock
    private PisteRepository pisteRepository;

    @Mock
    private CoursRepository coursRepository;

    @InjectMocks
    private SkieurService skieurService;

    private Skieur skieur;
    private Piste piste;
    private Cours cours;

    @BeforeEach
    void setUp() {
        skieur = new Skieur();
        skieur.setNumSkieur(1L);
        skieur.setPistes(new HashSet<>());

        piste = new Piste();
        piste.setNumPiste(1L);
        piste.setNomPiste("Piste 1");

        cours = new Cours();
        cours.setNumCours(1L);
        //cours.setNomCours("Cours 1");
    }

    @Test
    void assignSkieurToPiste() {
        when(skieurRepository.findByNumSkieur(anyLong())).thenReturn(skieur);
        when(pisteRepository.findByNumPiste(anyLong())).thenReturn(piste);

        Skieur result = skieurService.assignSkieurToPiste(skieur.getNumSkieur(), piste.getNumPiste());

        assertNotNull(result);
        assertTrue(result.getPistes().contains(piste));
        verify(skieurRepository).findByNumSkieur(anyLong());
        verify(pisteRepository).findByNumPiste(anyLong());
    }

 /*  @Test
    void addSkieurAndAssignToCourse() {
        when(coursRepository.findByNumCours(anyLong())).thenReturn(cours);
        when(skieurRepository.save(any(Skieur.class))).thenReturn(skieur);

        Skieur newSkieur = new Skieur();
        newSkieur.setNomS("Test Skieur");
        newSkieur.setNumSkieur(123L);
        newSkieur.setInscriptions(new HashSet<>()); // Initialize inscriptions

        Skieur result = skieurService.addSkieurAndAssignToCourse(newSkieur, cours.getNumCours());

        assertNull(result); // Since the method returns null, but let's focus on the behavior
        verify(coursRepository).findByNumCours(anyLong());
        verify(skieurRepository).save(any(Skieur.class));
    }*/

}