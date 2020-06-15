package part21_design_partten.memory_pool;

public class BulletPool extends MemoryPool {
    @Override
    protected Bullet allocate() {
        return new Bullet();
    }
}
