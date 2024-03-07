package controller;

import model.CitaEspecialista;
import model.CitaGeneral;
import model.CitaMedica;

import java.time.LocalDate;
import java.util.*;

public class ControladorCitas {

    private List<CitaMedica> citas = new ArrayList<>();

    public void insertarCita(CitaMedica cita) {
        citas.add(cita);
    }

    public void eliminarCita(CitaMedica cita) {
        citas.remove(cita);
    }

    public CitaMedica buscarCitaPorId(String id) {
        for (CitaMedica cita : citas) {
            if (cita.getNumeroIdentificacion().equals(id)) {
                return cita;
            }
        }
        return null;
    }

    public String obtenerInformacionPacientePorId(String id) {
        CitaMedica cita = buscarCitaPorId(id);
        if (cita != null) {
            return cita.toString(); // Suponiendo que has implementado el método toString en la clase CitaMedica
        } else {
            return "No se encontró ninguna cita con el ID proporcionado.";
        }
    }

    public List<CitaMedica> listarCitas() {
        return citas;
    }

    public double calcularCostoTotal(String tipoCita) {
        double costoTotal =0;
        for (CitaMedica cita : citas) {
            {
                costoTotal += cita.calcularCosto();
            }
        }
        return costoTotal;
    }

    public boolean idExistente(String numeroIdentificacion) {
        for (CitaMedica cita : citas) {
            if (cita.getNumeroIdentificacion().equals(numeroIdentificacion)) {
                return true;
            }
        }
        return false;
    }

    public void modificarCita(CitaMedica citaModificada) {
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getNumeroIdentificacion().equals(citaModificada.getNumeroIdentificacion())) {
                citas.set(i, citaModificada);
                break;
            }
        }
    }

    public List<CitaMedica> getCitas() {
        return citas;
    }

}

