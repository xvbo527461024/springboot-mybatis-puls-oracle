package cn.sm.com.base;

import cn.sm.com.domain.BmEntity;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.extension.activerecord.Model;

@KeySequence("seq_id")
public abstract class BaseEntity<T> extends Model {
}
