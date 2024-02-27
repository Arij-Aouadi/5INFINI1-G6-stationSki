package com.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.example.stationski.entities.couleur;
import com.example.stationski.entities.Piste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class PisteMockTest {

    @Mock
    private Piste mockPiste;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        when(mockPiste.getnumPiste()).thenReturn(2L);
        when(mockPiste.getcouleur()).thenReturn(Couleur.BLEU);
        when(mockPiste.getlongeur()).thenReturn(100);
        when(mockPiste.getpente()).thenReturn(30);
    }

    @Test
    void testGetNumPisteWithMock() {
        assertEquals(2L, mockPiste.getnumPiste());
    }

   
    @Test
    void testGetColorWithMock() {
        assertEquals(Couleur.BLEU, mockPiste.getcouleur());
    }

    @Test
    void testGetLengthWithMock() {
        assertEquals(100, mockPiste.getlongeur());
    }

    @Test
    void testGetSlopeWithMock() {
        assertEquals(30, mockPiste.getpente());
    }
}
