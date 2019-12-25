package br.com.sauderesidencewebservice.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/srhcws")
public class SaudeResidenceWS {

	
	@GET
	@Produces("text/plain")
	@Path("/testeacesso")
	public String testeAcesso() {
		return "Teste validado com sucesso.";
	}
	
}
