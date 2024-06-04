package com.git.sweetmanager.payment.domain.services;

import com.git.sweetmanager.payment.domain.model.aggregates.Subscription;
import com.git.sweetmanager.payment.domain.model.queries.GetAllSubscriptionsQuery;
import com.git.sweetmanager.payment.domain.model.queries.GetSubscriptionByIdQuery;

import java.util.List;
import java.util.Optional;

public interface SubscriptionQueryService {
    List<Subscription> handle(GetAllSubscriptionsQuery query);

    Optional<Subscription> handle(GetSubscriptionByIdQuery query);
}
