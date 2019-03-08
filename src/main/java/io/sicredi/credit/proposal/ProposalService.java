package io.sicredi.credit.proposal;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Path("/proposals")
public class ProposalService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Proposal[] proposals() {
        return (Proposal[]) Arrays.asList(new Proposal()).toArray();
    }
}
