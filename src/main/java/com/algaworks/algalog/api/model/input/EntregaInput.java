package com.algaworks.algalog.api.model.input;

import java.math.BigDecimal;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class EntregaInput {

	@Valid
	@NotNull
	private ClienteInput cliente;
	
	@Valid
	@NotNull
	private DestinatarioInput destinatario;
	
	@NotNull
	private BigDecimal taxa;

	public ClienteInput getCliente() {
		return cliente;
	}

	public void setCliente(ClienteInput cliente) {
		this.cliente = cliente;
	}

	public DestinatarioInput getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(DestinatarioInput destinatario) {
		this.destinatario = destinatario;
	}

	public BigDecimal getTaxa() {
		return taxa;
	}

	public void setTaxa(BigDecimal taxa) {
		this.taxa = taxa;
	}
}
