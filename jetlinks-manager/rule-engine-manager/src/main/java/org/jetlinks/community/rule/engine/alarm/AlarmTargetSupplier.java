package org.jetlinks.community.rule.engine.alarm;

import java.util.Map;
import java.util.Optional;

/**
 * @author Alex Zhang
 */
public interface AlarmTargetSupplier {

    Optional<AlarmTarget> getByType(String type);

    Map<String, AlarmTarget> getAll();

    static AlarmTargetSupplier get(){
        return CustomAlarmTargetSupplier.defaultSupplier;
    }

}
