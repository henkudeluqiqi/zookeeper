import org.apache.zookeeper.*;

public class ZookeeperServer {


    public static void main(String[] args) throws Exception {

        ZooKeeper zooKeeper = new ZooKeeper("localhost:2181", 10000, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                System.out.println("连接成功了");
            }
        }, false);
        String s = zooKeeper.create("/jb213", "123".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.in.read();
    }
}

