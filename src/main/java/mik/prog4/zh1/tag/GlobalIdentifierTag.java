package mik.prog4.zh1.tag;

import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import mik.prog4.zh1.entity.Pet;
import mik.prog4.zh1.service.PetService;

import java.io.IOException;

public class GlobalIdentifierTag extends SimpleTagSupport {

    private Pet pet;
    private static final PetService petService = new PetService();

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public void doTag() throws IOException {
        JspWriter out = getJspContext().getOut();
        if(pet != null) {
            String globalIdentifier = String.valueOf(petService.getGlobalIdentifier(pet));
            out.println(String.format(globalIdentifier));
        }

    }
}
