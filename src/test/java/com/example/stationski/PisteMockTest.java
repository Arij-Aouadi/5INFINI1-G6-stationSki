package com.example.stationski;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.example.stationski.entities.Couleur;
import com.example.stationski.entities.Piste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PisteMockTest {

    @Mock
    private Piste mockPiste;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockPiste.getNumPiste()).thenReturn(2L);
        when(mockPiste.getCouleur()).thenReturn(Couleur.BLEU);
        when(mockPiste.getLongeur()).thenReturn(100);
        when(mockPiste.getPente()).thenReturn(30);
    }

    @Test
    void testGetNumPisteWithMock() {
        assertEquals(2L, mockPiste.getNumPiste());
    }

   
    @Test
    void testGetColorWithMock() {
        assertEquals(Couleur.BLEU, mockPiste.getCouleur());
    }

    @Test
    void testGetLengthWithMock() {
        assertEquals(100, mockPiste.getLongeur());
    }

    @Test
    void testGetSlopeWithMock() {
        assertEquals(30, mockPiste.getPente());
    }
}
