package com.company.demo;

  import com.sun.security.ntlm.Client;

  import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.List;
        import java.util.Map;
        import java.util.concurrent.atomic.AtomicInteger;

@Service
public abstract class ClientServiceImpl implements ClientService {

    // Хранилище клиентов
    private static final Map<Integer, Client> CLIENT_REPOSITORY_MAP = new HashMap<>();

    // Переменная для генерации ID клиента
    private static final AtomicInteger CLIENT_ID_HOLDER = new AtomicInteger();

    public void create(Client client) {
        final int clientId = CLIENT_ID_HOLDER.incrementAndGet();
        client.debug(String.valueOf(clientId));
        CLIENT_REPOSITORY_MAP.put(clientId, client);
    }

    @Override
    public List<Client> readAll() {
        return new ArrayList<>(CLIENT_REPOSITORY_MAP.values());
    }

    @Override
    public Client read(int id) {
        return CLIENT_REPOSITORY_MAP.get(id);
    }

    @Override
    public boolean update(Client client, int id) {
        if (CLIENT_REPOSITORY_MAP.containsKey(id)) {
            client.debug(String.valueOf(id));
            CLIENT_REPOSITORY_MAP.put(id, client);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        return CLIENT_REPOSITORY_MAP.remove(id) != null;
    }
}
