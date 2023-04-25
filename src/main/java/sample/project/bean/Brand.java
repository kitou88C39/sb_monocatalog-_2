package sample.project.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Javaのコンパイル時にアクセスメソッドを作ってくれる
@AllArgsConstructor
@NoArgsConstructor
public class Brand {

    // ブランドID
    private String brandId;
    // ブランド名
    private String brandName;
}
