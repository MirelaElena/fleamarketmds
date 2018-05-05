package ro.unibuc.fmi.fleamarket.fleamarket.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class MailContentBuilder {

    private TemplateEngine templateEngine;

    @Autowired
    public MailContentBuilder(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String build(String header,String text) {
        Context context = new Context();
        context.setVariable("mesaj", header);
        context.setVariable("text",text);
        return templateEngine.process("mailTemplate", context);
    }

}