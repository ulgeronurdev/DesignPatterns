/*
Lambanın kaç tane durumu varsa onları burada interface olarak tanımlarız.
*/
public interface LampState {
    void onOpen();
    void onClose();
}
