package io.pivotal.rmqestimator.matchers;

import com.rmqclustermgr.rest.mgmt.model.ReceivedMessage;


/**
 * @author Richard Clayton (Berico Technologies)
 */
public interface MessageMatcher extends Matcher<ReceivedMessage> {}