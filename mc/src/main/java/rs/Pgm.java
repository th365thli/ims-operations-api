package rs;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import annotations.CheckHeader;
import commands.query.pgm.QueryPgm;
import commands.type2.Type2Command;
import icon.helpers.MCInteraction;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import json.java.JSONObject;
import om.exception.OmCommandGenerationException;
import utils.RestUtils;
import utils.Type2CommandSerializable;
import zowe.mc.servlet.OMServlet;

@Stateless
@Path("/pgm")
@Api(tags = {"pgm"})
@CheckHeader
public class Pgm {

	@EJB
	OMServlet omServlet;

	private static final Logger logger = LoggerFactory.getLogger(Pgm.class);

	@Path("/query")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(produces="application/json", value = "Return data from Query PGM IMS command", httpMethod="GET", notes = "<br>This service submits a 'Query PGM' IMS command and returns the output", response = JSONObject.class)
	@ApiResponses(value = { @ApiResponse(code = 200, response = JSONObject.class, message = "Successful operation"),
			@ApiResponse(code = 400, response = JSONObject.class, message = "Om returned non zero return code"),
			@ApiResponse(code = 500, message = "Internal Server Error")
	})
	public Response query(@QueryParam("names") List<String> name, @QueryParam("show") List<String> show, @QueryParam("route") List<String> imsmbr, 
			@ApiParam(value = "IMS Connect host address", required = true) @HeaderParam("hostname") String hostname,
			@ApiParam(value = "IMS Connect port number", required = true) @HeaderParam("port") String port,
			@ApiParam(value = "IMS Connect plex name", required = true) @HeaderParam("plex") String plex) {

		//TODO
		//Implement show options. Return http code 400 if invalid show option

		MCInteraction mcSpec = new MCInteraction();
		mcSpec.setHostname(hostname);
		mcSpec.setPort(Integer.parseInt(port));
		mcSpec.setImsPlexName(plex);

		QueryPgm pgm = new QueryPgm();
		pgm.getNAME().addAll(name);

		pgm.getSHOW().add(QueryPgm.ShowOptions.ALL);

		Type2Command type2Command = new Type2Command();
		type2Command.setQueryPgm(pgm);
		type2Command.setVerb(Type2Command.VerbOptions.QUERY); 
		type2Command.setResource(Type2Command.ResourceOptions.PGM);
		type2Command.getRoute().addAll(imsmbr);
		
		mcSpec.getDatastores().addAll(imsmbr);
		
		JSONObject result = new JSONObject();

		Type2CommandSerializable type2CommandSerializable = new Type2CommandSerializable();
		try {
			String cmd = type2CommandSerializable.fromType2CommandObject(type2Command);
			result = omServlet.executeUserImsCommand(cmd, mcSpec);
		} catch (OmCommandGenerationException e1) {
			logger.error("Unable to generate IMS command", e1);
			return Response.status(Status.INTERNAL_SERVER_ERROR)
					.build();
		} 

		return RestUtils.processCommandOutput(result);
	}

	@Path("/start")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(produces="application/json", value = "Return data from START PGM IMS command", httpMethod="PUT", notes = "<br>This service submits a 'Start PGM' IMS command and returns the output", response = JSONObject.class)
	@ApiResponses(value = { @ApiResponse(code = 200, response = JSONObject.class, message = "Successful operation"),
							@ApiResponse(code = 400, response = JSONObject.class, message = "Om returned non zero return code"),
							@ApiResponse(code = 500, message = "Internal Server Error")
	})
	public Response start(@QueryParam("names") List<String> name,
			@ApiParam(value = "IMS Connect host address", required = true) @HeaderParam("hostname") String hostname,
			@ApiParam(value = "IMS Connect port number", required = true) @HeaderParam("port") String port,
			@ApiParam(value = "IMS Connect plex name", required = true) @HeaderParam("plex") String plex) {


		return Response.ok().build();
	}
	
	
	@Path("/create")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(produces="application/json", value = "Return data from CREATE PGM IMS command", httpMethod="PUT", notes = "<br>This service submits a 'Create PGM' IMS command and returns the output", response = JSONObject.class)
	@ApiResponses(value = { @ApiResponse(code = 200, response = JSONObject.class, message = "Successful operation"),
							@ApiResponse(code = 400, response = JSONObject.class, message = "Om returned non zero return code"),
							@ApiResponse(code = 500, message = "Internal Server Error")
	})
	public Response create(@QueryParam("names") List<String> name, @QueryParam("set") List<String> set,
			@ApiParam(value = "IMS Connect host address", required = true) @HeaderParam("hostname") String hostname,
			@ApiParam(value = "IMS Connect port number", required = true) @HeaderParam("port") String port,
			@ApiParam(value = "IMS Connect plex name", required = true) @HeaderParam("plex") String plex) {


		return Response.ok().build();
	}
	
	



}
