package org.openvasp.client.service;

import org.openvasp.client.model.EncryptionType;
import org.openvasp.client.model.Topic;
import org.openvasp.client.model.VaspMessage;

/**
 * @author Olexandr_Bilovol@epam.com
 */
public interface MessageService {

    void send(
            Topic topic,
            EncryptionType encType,
            String key,
            VaspMessage message);

    long addTopicListener(
            Topic topic,
            EncryptionType encType,
            String key,
            TopicListener<VaspMessage> listener);

    void removeTopicListener(
            Topic topic,
            long listenerId);

}
