package com.tienda.tienda_de_ropa.service;

import com.tienda.tienda_de_ropa.dtos.ClienteDTO;
import com.tienda.tienda_de_ropa.models.Cliente;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;
import java.util.List;


public interface ClienteService {

    public List<ClienteDTO> getClientesDTO();

    public ClienteDTO clienteDTO(long id);

    public Cliente findByCorreo(String correo);

    public void guardarCliente(Cliente cliente);

    public Cliente encontrarPorId(long id);

    public void eliminarCliente(Cliente cliente);

    public void enviarCorreoVerificacion(Cliente cliente, String sitioURL) throws MessagingException, UnsupportedEncodingException;

    public boolean verificacion(String token);
}
