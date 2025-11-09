package com.eazybytes.cards.cards.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware<String> {
    /**
     * @return
     */
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("CARDS_MS");
    }
}
